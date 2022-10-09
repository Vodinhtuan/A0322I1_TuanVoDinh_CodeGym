package repository.CRUDimpl;

import model.Imployee;
import repository.ImployeeRepository;

import java.sql.SQLException;
import java.util.List;

public class ImployeeImplement implements ImployeeRepository {
    @Override
    public void create(Imployee imployee) throws Exception {

    }

    @Override
    public void update(Imployee imployee) throws Exception {

    }

    @Override
    public boolean deleteById(int id) throws Exception {
        return false;
    }

    @Override
    public Imployee findById(int id) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public List<Imployee> findAll() throws SQLException, ClassNotFoundException {
        return null;
    }
}
