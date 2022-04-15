
public class Sach
{  public String tensach, tentacgia, nhaxuatban, loaisach;
   public int masach;
   public int so_trang, so_luong, sotap;
   public float gia;
   Sach(String tensach, String tentacgia, int masach, int so_trang, int so_luong, String nhaxuatban, String loaisach, int sotap, float gia)
   {
	 this.tensach = tensach;
	 this.tentacgia = tentacgia;
	 this.masach = masach ;
	 this.so_trang = so_trang;
	 this.so_luong = so_luong;
	 this.nhaxuatban = nhaxuatban;
	 this.loaisach = loaisach;
	 this.sotap = sotap;
	 this.gia = gia;
	 
   }
   public void in() 
   {
	   System.out.println(tensach+", tac gia: "+tentacgia+", ma: "+masach+", sach gom "+so_trang+"trang , so luong "+so_luong+" quyen ,"+" nha xuat ban la "
   +nhaxuatban+", "+sotap+" tap, "+gia+" dong ");
   }
   public static void main(String[] args) 
   {
	   Sach bo1 = new Sach("Sach hoc lam nguoi", "Tran Danh Thang", 123456, 100, 1000,"Kim Dong", "sach hoc tap", 20, 200);
	   bo1.in();
	   Sach bo2 = new Sach("Sach hoc java", "Tran Danh Thang", 234567, 200, 2000, "Kim Dong","sach hoc tap", 30, 500);
	   bo2.in();
   }
}
