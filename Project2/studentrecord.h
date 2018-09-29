/*
 * studentrecord.h
 *
 *  Created on: Sep 21, 2017
 *      Author: Niraj Regmee
 */

#ifndef STUDENTRECORD_H_
#define STUDENTRECORD_H_

#include <iostream>
#include <string>
using namespace std;

class studentrecord {
	private:
    string studentName;
    string studentID;
    string studentAddress;
    double studentGPA;
    
public:
	studentrecord();
	studentrecord(string, string, string, double);
	virtual ~studentrecord();
    void display();
};

#endif /* STUDENTRECORD_H_ */
