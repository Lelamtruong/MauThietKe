/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT2_2_BT4On;

/**
 *
 * @author Administrator
 */
public class KhachHangThanThiet extends HoaDon{
    @Override
    public double tinhChietKhau() {
        if(tinhTien() >= 500_000)
            return tinhTien() * 0.02;
        return 0;
    }
    
}
