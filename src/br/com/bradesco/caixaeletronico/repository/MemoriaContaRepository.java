package br.com.bradesco.caixaeletronico.repository;

public class MemoriaContaRepository implements BaseRepository<Conta> {

    private List<Conta> contas = new ArrayList<>();

    @Override
    public List<Conta> findAll() {
        return contas;
    }

    @Override
    public Conta findByld(int id) {
        return
    }
}
