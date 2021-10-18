/*
 * Creations of custom indexes:
 * Pros
 * 		-Faster Retrieval of data
 * 		-Better for tables whose records are searched frequently
 * 		-Better for larger collections of data
 * 
 * Cons
 * 		-Slower when adding/updating any records, particualarly when changing
 * 			the indexed column or inserting in the middle of a collection,
 *  		since index values must be updated after the inserted record row
 */
-- INDEXES : Similar to index in our collections in Java...
CREATE INDEX emp_index ON examples.employees (emp_id);

/*
 * CREATE INDEX <index_name> ON <table_name> USING <pattern> (<column_name>)
 * https://www.postgresql.org/docs/11/indexes-types.html
 * 
 * HASH - hashcode
 * 
 * 		GiST, SP-GiST, GIN, BRIN
 */
