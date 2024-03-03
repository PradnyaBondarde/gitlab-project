import java.time.LocalDate;
import java.util.*;

class Task{
	String name;
	LocalDate startDate;
	LocalDate endDate;
	String progress;

	public Task(String name,LocalDate startDate,LocalDate endDate,String progress){
		this.name=name;
		this.startDate=startDate;
		this.endDate=endDate;
		this.progress=progress;
		}

		@override
		public String toString(){
			return "Task{" +
				"name='"+name+'\''+
				",startDate="+startDate+
				",endDate="+endDate+
				",progess='"+progress+'\''+'}'+
}
}
