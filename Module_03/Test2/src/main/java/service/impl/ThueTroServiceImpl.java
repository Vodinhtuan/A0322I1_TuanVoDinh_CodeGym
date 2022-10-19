package service.impl;

import model.ThanhToan;
import model.ThueTro;
import repository.ThueTroRepository;
import repository.impl.ThueTroRepositoryImpl;
import service.ThueTroService;

import java.sql.SQLException;
import java.util.List;

public class ThueTroServiceImpl implements ThueTroService {
    private ThueTroRepository repository = new ThueTroRepositoryImpl();
    private ThueTroRepositoryImpl thueTroRepository = new ThueTroRepositoryImpl();
    @Override
    public void create(ThueTro thueTro) throws Exception {
        repository.create(thueTro);
    }

    @Override
    public void update(ThueTro thueTro) throws Exception {
        repository.update(thueTro);
    }

    @Override
    public boolean deleteById(int id) throws Exception {
        return repository.deleteById(id);
    }

    @Override
    public ThueTro findById(int id) throws SQLException, ClassNotFoundException {
        return repository.findById(id);
    }

    @Override
    public List<ThueTro> findAll() throws SQLException, ClassNotFoundException {
        return repository.findAll();
    }
    public List<ThanhToan> displayThanhToan(){
        return thueTroRepository.displayThanhtoan();
    }
}
