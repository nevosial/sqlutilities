- SQLAlchemy ORM
- Queries returns data in a row proxy
  - The db_session.execute(query) returns a ResultProxy object
  - The ResultProxy object is made up of RowProxy objects
  - The RowProxy object has an .items() method that returns key, value tuples of all the items in the row.
  
  
  
  
  /*Please add ; after each select statement*/
CREATE PROCEDURE projectList()
BEGIN
	select project_name, team_lead, income from Projects
    order by internal_id;
END
