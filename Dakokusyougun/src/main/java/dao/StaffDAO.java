package dao;

public class StaffDAO {

	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/vmwdb";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";

	//メソッド名：ユーザー情報取得
		//引数　　　：社員番号
		//戻り値　　：引数の社員番号と同じ社員番号の社員マスタレコード情報
	
	public class getLoginUser{
		
	}
	
	
	//メソッド名：社員情報一覧表示
	//引数　　　：なし
	//戻り値　　：論理削除されていない社員情報全件
	
	public class showStaffList{
		
	}
	
	//メソッド名：社員情報登録
		//引数　：社員番号、権限、氏名、上司番号
		//戻り値：更新後の社員マスタレコード情報
	
	public class insertStaff{
		
	}
	
	//メソッド名：社員情報更新
			//引数　：社員番号、権限、氏名、上司番号
			//戻り値：更新後の社員マスタレコード情報
	
    public class updateStaff{
		
	}
    
    //メソッド名：社員情報削除
   //引数：社員番号
   //戻り値：更新後のレコード情報
    
    public class deleteStaff{
		
   	}
}
