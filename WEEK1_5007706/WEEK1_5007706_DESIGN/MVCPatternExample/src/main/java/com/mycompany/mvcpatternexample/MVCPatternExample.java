/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mvcpatternexample;

/**
 *
 * @author nikhi
 */
public class MVCPatternExample {

    public static void main(String[] args) {
        Student student = new Student();
        student.setId("1");
        student.setName("NIKI S V");
        student.setGrade("O");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();
        System.out.println("After updation ");
        controller.setStudentName("Nikhitha S V");
        controller.setStudentGrade("O");

        controller.updateView();
    }
}
