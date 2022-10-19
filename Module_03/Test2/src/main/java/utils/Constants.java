package utils;

public interface Constants {
    String SELECT_ALL_THUETRO = "select tt.maPhong, tt.name, tt.phone, tt.ngayThue, tt.ghiChu, th.maThanhToan from thanhToan th join thueTro tt on th.maThanhToan = th.maThanhToan;";
    String INSERT_INTO_THUETRO = "insert into thueTro values(?,?,?,?,?,?)";
    String UPDATE_THUETRO = "update thueTro set name = ?, phone = ?, ngayThue = ?, ghiChu=?,maThanhToan=? where maPhong = ?;";
    String FIND_THUETRO_BY_ID = "select * from thueTro where maPhong = ?;";
    String DELETE_THUETRO_SQL = "delete from thueTro where maPhong = ?;";
    String SELECT_ALL_THANHTOAN = "select * from thanhToan;";
}
