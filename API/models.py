from flask import Flask , request
from flask_restful import Api , Resource
from flask_sqlalchemy import SQLAlchemy

db = SQLAlchemy()

class Employee(db.Model):
    __tabelname__ = "employee"
    id = db.Column(db.Integer , Primary_key = True)
    name = db.Column(db.String , nullable = False)
    city = db.Column(db.String , nullable = False)
    

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

app.run(debug=True)