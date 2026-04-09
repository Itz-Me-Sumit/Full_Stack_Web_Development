from flask import Flask, request
from flask_restful import Api, Resource
from flask_sqlalchemy import SQLAlchemy

# App setup
app = Flask(__name__)
app.config["SQLALCHEMY_DATABASE_URI"] = "sqlite:///mydy.sqlite3"
app.config["SQLALCHEMY_TRACK_MODIFICATIONS"] = False

db = SQLAlchemy(app)
api = Api(app)


# Database Model
class Employee(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(100), nullable=False)
    city = db.Column(db.String(100), nullable=False)

# Create DB tables
with app.app_context():
    db.create_all()

# Resource Class
class EmployeeApi(Resource):

    # GET → Fetch employee by ID
    def get(self, id):
        emp = Employee.query.filter_by(id=id).first()

        if emp:
            return {
                "id": emp.id,
                "name": emp.name,
                "city": emp.city
            }
        else:
            return {"message": "Employee not found"}, 404

    # POST → Add new employee
    def post(self):
        data = request.get_json()

        if not data or not data.get("name") or not data.get("city"):
            return {"message": "Name and City are required"}, 400

        new_emp = Employee(
            name=data["name"],
            city=data["city"]
        )

        db.session.add(new_emp)
        db.session.commit()

        return {"message": "Employee created", "id": new_emp.id}, 201

    # PUT → Update employee
    def put(self, id):
        emp = Employee.query.filter_by(id=id).first()

        if not emp:
            return {"message": "Employee not found"}, 404

        data = request.get_json()

        if "name" in data:
            emp.name = data["name"]

        if "city" in data:
            emp.city = data["city"]

        db.session.commit()

        return {"message": "Employee updated"}

    # DELETE → Delete employee
    def delete(self, id):
        emp = Employee.query.filter_by(id=id).first()

        if not emp:
            return {"message": "Employee not found"}, 404

        db.session.delete(emp)
        db.session.commit()

        return {"message": "Employee deleted"}


# Routes
api.add_resource(
    EmployeeApi,
    "/api/employee",            # POST
    "/api/employee/<int:id>"    # GET, PUT, DELETE
)

# Run Server
if __name__ == "__main__":
    app.run(debug=True)