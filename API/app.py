from flask import Flask , request
from flask_restful import Api , Resource

# instances are created
app = Flask(__name__)
api = Api(app)

# REST API for employee table

class employee(Resource):
    def get(self):
        pass

    def post(self):
        pass

    def put(self):
        pass
    
    def delete(self):
        pass

emp_data = [{"id":1 , "name":"Sumit" , "city":"Begusarai"}]


@app.route("/employees")
def get_employees():
    return emp_data , 200

@app.route("/search/<id>")
def search_emp(id):
    for e in emp_data:
        if e["id"] == id:
            return e , 200
    return {"message":f"Employee id {id} is not found"} , 404


@app.route("/add" , methods =["GET" , "POST"])
def add_emp():
    data = request.get_json()
    emp_data.append( {"id": data["id"] , "name": data["name"] , "city": data["city"]} )
    return {"msg": "Employe Record is created"} , 201

app.run(debug = True)