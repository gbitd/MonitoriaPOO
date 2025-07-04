package com.gbitd.projeto;

import com.gbitd.projeto.view.*;
import com.gbitd.projeto.controllers.*;
import com.gbitd.projeto.model.*;


public class App {
    public static void main(String[] args) {
        CalculadoraModel model = new CalculadoraModel();
        CalculadoraView view = new CalculadoraView();
        CalculadoraController controller = new CalculadoraController(model, view);

    }
}
