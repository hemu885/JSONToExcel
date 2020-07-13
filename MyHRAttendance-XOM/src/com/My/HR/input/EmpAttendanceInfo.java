package com.My.HR.input;

public class EmpAttendanceInfo {
	
	private String starTime;
	private String endTime;
	private String shiftStartTime;
	private String avgAttendance ;
	
	public EmpAttendanceInfo(){
		
	}
	
   public EmpAttendanceInfo(String starTime,String endTime,String shiftStartTime, String avgAttendance){
		this.starTime = starTime;
		this.endTime = endTime;
		this.shiftStartTime = shiftStartTime;
		this.avgAttendance =avgAttendance;
	   
	}
	
	public String getStarTime() {
		return starTime;
	}
	public void setStarTime(String starTime) {
		this.starTime = starTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getShiftStartTime() {
		return shiftStartTime;
	}
	public void setShiftStartTime(String shiftStartTime) {
		this.shiftStartTime = shiftStartTime;
	}
	public String getAvgAttendance() {
		return avgAttendance;
	}
	public void setAvgAttendance(String avgAttendance) {
		this.avgAttendance = avgAttendance;
	}
	
	

}
