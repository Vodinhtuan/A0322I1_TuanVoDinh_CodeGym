package repository.impl;

import model.ThanhToan;
import model.ThueTro;
import repository.ThueTroRepository;
import utils.ConnectionUtils;
import utils.Constants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ThueTroRepositoryImpl implements ThueTroRepository {
    @Override
    public void create(ThueTro thueTro) throws Exception {
        try (
                Connection connection = ConnectionUtils.getConnection();
                PreparedStatement statement = connection.prepareStatement(Constants.INSERT_INTO_THUETRO);
        ) {
            statement.setInt(1, thueTro.getMaPhong());
            statement.setString(2, thueTro.getName());
            statement.setInt(3, thueTro.getPhone());
            statement.setDate(4, (Date) thueTro.getNgayThue());
            statement.setString(5,thueTro.getGhiChu());
            statement.setInt(6, thueTro.getMaThanhToan());
            statement.executeUpdate();
        }
    }

    @Override
    public void update(ThueTro thueTro) throws Exception {

    }

    @Override
    public boolean deleteById(int id) throws Exception {
        return false;
    }

    @Override
    public ThueTro findById(int id) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public List<ThueTro> findAll() throws SQLException, ClassNotFoundException {
        List<ThueTro> thuetro = new ArrayList<>();
        try (Connection connection = ConnectionUtils.getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(Constants.SELECT_ALL_THUETRO);) {
            while (rs.next()) {
                int maPhong = rs.getInt("maPhong");
                String name = rs.getString("name");
                int phone = rs.getInt("phone");
                Date ngayThue = rs.getDate("ngayThue");
                String ghiChu = rs.getString("ghiChu");
                int maThanhToan = rs.getInt("maThanhToan");
                thuetro.add(new ThueTro(maPhong,name,phone,ngayThue,ghiChu,maThanhToan));
            }
        }
        return thuetro;
    }

    public List<ThanhToan> displayThanhtoan(){
        List<ThanhToan> categories = new ArrayList<>();
        try (Connection connection = ConnectionUtils.getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(Constants.SELECT_ALL_THANHTOAN);) {
            while (rs.next()) {
                int maThanhToan = rs.getInt("maThanhToan");
                String cachThanhToan = rs.getString("cachThanhToan");
                categories.add(new ThanhToan(maThanhToan, cachThanhToan));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return categories;
    }
}
