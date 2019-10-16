package com.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.training.entities.Courses;
import com.training.model.AttendeesAdminModel;
import com.training.model.ScheduleAdminModel;
import com.training.model.VenueAdminModel;



public interface AdminDAO {
	
	public boolean updateDate(ScheduleAdminModel scheduleAdminModel)throws ClassNotFoundException, SQLException;
	public ResultSet Numberofattendees(AttendeesAdminModel adminModel)throws ClassNotFoundException, SQLException;
	public boolean updateVenue(VenueAdminModel venueAdminModel)throws ClassNotFoundException, SQLException;

}
