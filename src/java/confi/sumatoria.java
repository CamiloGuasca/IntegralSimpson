/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package confi;

import modelo.integral;

/**
 *
 * @author camilog
 */
public class sumatoria {
    public double[][] simpson(integral obj){
        double [][] sum = new double[obj.getDivi()+1][3];
        for (int c = 0; c < sum.length; c++) {
            for (int p = 0; p < sum[c].length; p++) {
                if(c == 0){
                    sum[c][p] = obj.getIntinf();
                }else if(c == sum.length-1){
                    sum[c][p] = obj.getIntsup();
                }else if(p == 0){
                    sum[c][p] = sum[c-1][p]+obj.getDelx();
                }
                
                
                if(p == 1){
                    System.out.println("QAAA"+sum[c][p-1]);
                    sum[c][p] = operacion(sum[c][p-1], obj.getFuncion());
                }else if(p == 2){
                    if(c == 0 || c == sum.length-1){
                        sum[c][p] = sum[c][p-1];
                    }else if(c%2 == 0){
                        sum[c][p] = sum[c][p-1]*2;
                    }else{
                        sum[c][p] = sum[c][p-1]*4;
                    }
                }
            }
        }
        return sum;
    }
    
    public double operacion(double num, String op){
        double tot = 0;
        switch(op){
            case "ln":
                tot = Math.log(num);
                break;
            case "sen":
                tot = Math.sin(num);
                break;
            case "cos":
                tot = Math.cos(num);
                break;
            case "tan":
                tot = Math.tan(num);
                break;
            default:
                System.out.println("Opción No Válida");
        }
        return tot;
    }
    
    public double total(integral ob, double suma[][]){
        double tot = 0;
        for (int c = 0; c < suma.length; c++) {
            tot += suma[c][2];
        }
        tot *= ob.getDelx()/3;
        return tot;
    }
}
