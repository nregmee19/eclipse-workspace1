/*
 * studentrecord.cpp
 *
 *  Created on: Sep 21, 2017
 *      Author: Niraj Regmee
 */

#include "studentrecord.h"
#include <iostream>


void studentrecord::display(){
    cout << "Name: "<<studentName<<endl;
    cout << "ID: "<<studentID<<endl;
    cout << "Address: "<<studentAddress<<endl;
    cout << "GPA: "<<studentGPA<<endl;
    cout<<"******************************"<<endl;
    
}
studentrecord::studentrecord() {
	    studentName = "Niraj";
	    studentID ="";
	    studentAddress ="";
	    studentGPA = 0;
	    // TODO Auto-generated constructor stub

}
studentrecord::studentrecord(string name, string ID, string address, double gpa) {
	    studentName = name;
	    studentID = ID;
	    studentAddress = address;
	    studentGPA = gpa;

studentrecord::~studentrecord() {
	// TODO Auto-generated destructor stub
}

