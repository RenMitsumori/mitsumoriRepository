package model;

public class HealthCheckLogic {
public void execute(Health health) {
	//BMIを算出して設定
	double weight=health.getWeight();
	double height=health.getHeight();
	double bmi =weight /(height/100.0 * height/ 100.0);
	health.setBmi(bmi);
	
	String bodeyType;
	if(bmi<18.5) {
		bodeyType= "ガリガリ";
	}else if (bmi <25) {
		bodeyType = "普通";
	}else {
		bodeyType="くそデブ";
	}
	health.setBodyType(bodeyType);
  }
}
