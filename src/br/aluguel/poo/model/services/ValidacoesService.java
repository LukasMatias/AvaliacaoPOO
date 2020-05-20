package br.aluguel.poo.model.services;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author lukas
 */
public class ValidacoesService {

    public ArrayList<String> mensagensErro = new ArrayList<>();

    public String getMensagensErro() {
        String errosFormulario = "";
        for (String msg : this.mensagensErro) {
            errosFormulario += msg + "\n";
        }

        if (!errosFormulario.equals("")) {
            this.limparMensagens();
        }
        return errosFormulario;
    }

    public boolean hasError() {
        return mensagensErro.size() > 0;
    }

    public void campoVazio(JTextField txt) {

        if (txt.getText().trim().equals("")) {

            this.mensagensErro.add("Campo " + txt.getName() + " vazio, favor preencher.");
        }
    }

    public void validaNome(JTextField txt) {
        if (txt.getText().matches(".*[0-9].*")) {
            this.mensagensErro.add("Campo " + txt.getName() + " inválido, favor digitar apenas letras");
        }
    }

    public void validaNum(JTextField txt) {

        if (txt.getText().matches(".*[a-z].*") || txt.getText().matches(".*[,].*")) {
            this.mensagensErro.add("Campo " + txt.getName() + " inválido. Favor informar apenas números inteiros!");
        }
    }

    public void validaDouble(JTextField txt) {
        try {
            Double num = Double.parseDouble(txt.getText());
        } catch (NumberFormatException e) {
            this.mensagensErro.add("Campo " + txt.getName() + " inválido. Favor informar um valor válido.");
        }
    }

    public void limparMensagens() {
        this.mensagensErro.clear();
    }
}
