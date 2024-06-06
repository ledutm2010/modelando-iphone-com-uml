package iphone;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Realizando uma ligação para o número " + numero + ".");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando um correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url + ".");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionado a música " + musica + ".");
    }
}
