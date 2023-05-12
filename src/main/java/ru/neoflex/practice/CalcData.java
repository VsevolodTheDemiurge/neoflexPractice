package ru.neoflex.practice;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.persistence.*;

@Hidden
@Entity
@Table(name = "CalculatingData")
public class CalcData {

    private long id;
    private String operator;
    private int var_A;
    private int var_B;
    private int Result;


    public CalcData(){
    }

    public CalcData(String operator, int var_A, int var_B, int Result){
        this.operator = operator;
        this.var_A = var_A;
        this.var_B = var_B;
        this.Result = Result;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "Operator", nullable = false)
    public String getOperator(){
        return operator;
    }
    public void setOperator(String operator){
        this.operator = operator;
    }

    @Column(name = "Variable_A", nullable = false)
    public int getVar_A(){
        return var_A;
    }
    public void setVar_A(int var_A){
        this.var_A = var_A;
    }

    @Column(name = "varB", nullable = false)
    public int getVar_B(){
        return var_B;
    }
    public void setVar_B(int var_B){
        this.var_B = var_B;
    }

    @Column(name = "Result", nullable = false)
    public int getResult(){ return Result; }
    public void setResult(int Result){ this.Result = Result; }


}
