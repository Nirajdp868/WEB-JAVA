package dao;

import pojos.User;

public interface IUserDao {
String addData(User user);	

User getUserDetails(int userId);
String deleteUserDetails(int id);
}
