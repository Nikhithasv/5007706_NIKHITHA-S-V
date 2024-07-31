/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.commandpatternexample;

/**
 *
 * @author nikhi
 */
public class CommandPatternExample {

    public static void main(String[] args) {
         Light l = new Light();

        Command on = new LightOnCommand(l);
        Command off = new LightOffCommand(l);
        RemoteControl remote = new RemoteControl();

        
        remote.setCommand(on);
        remote.pressButton();

   
        remote.setCommand(off);
        remote.pressButton();
    }
}
