package authTest;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicAuthTest {
	@Test
	public void sampleTest() {
		given()
		
		.auth().oauth2("eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJsZUN3YUNPai00RXVlbzJkTFFrTmZuLXh2M0F3Nm5ZdWZtS0pINXBFWkNNIn0.eyJleHAiOjE3MjYxMzg4NTksImlhdCI6MTcyNjEzODU1MCwianRpIjoiNDdiMmI3YmQtMGRkOC00MTYwLWFlYmUtNGIwY2MxM2ViZDY4IiwiaXNzIjoiaHR0cDovLzQ5LjI0OS4yOC4yMTg6ODE4MC9hdXRoL3JlYWxtcy9uaW56YSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiI0ODVlYTJhYi1kY2MzLTQwOGItOTUxZi04NGMwM2JmZDAwMmYiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJuaW56YS1jbGllbnQiLCJzZXNzaW9uX3N0YXRlIjoiODk3ODlhZjktNGJmOS00NDQxLWIxZWYtNTM0NjAyNmQ0NjdjIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwOi8vNDkuMjQ5LjI4LjIxODo4MDkxIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJkZWZhdWx0LXJvbGVzLW5pbnphIiwib2ZmbGluZV9hY2Nlc3MiLCJhZG1pbiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJlbWFpbCBwcm9maWxlIiwic2lkIjoiODk3ODlhZjktNGJmOS00NDQxLWIxZWYtNTM0NjAyNmQ0NjdjIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJybWd5YW50cmEifQ.aUhy-H63InUNaFDhmUTyPEon-NMok7exnZ7mxFZq6p46GShqhQi-sar6xaph4Nji8EUu8CerTIzahjM7Pw0E_GWAfHsaLTDLu3nKkiQUQvXC0Jg13IBE-ziedKfGc4QhHK0M47foT3wxK6mAEl_6VRQJavcR7SOthQuDldDiJ6wnM9Q6keDphvSn3o9cPsZU9sdXxsHlcJG_YLH1w1W7QZ6zyntznC95lcu7ux6wyoxZiXKNUE9JJnlGpB8IvSGCw0ak0E3GBJz2nj-UoDiKZmL2NOxFm4zMbAVhRr_CE9a_0Koibmm12umqeM-u80oQ7CXYrFb0AcPG0wdRB6FHoA.eyJleHAiOjE3MjYxMzg4NTksImlhdCI6MTcyNjEzODU1MCwianRpIjoiNDdiMmI3YmQtMGRkOC00MTYwLWFlYmUtNGIwY2MxM2ViZDY4IiwiaXNzIjoiaHR0cDovLzQ5LjI0OS4yOC4yMTg6ODE4MC9hdXRoL3JlYWxtcy9uaW56YSIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiI0ODVlYTJhYi1kY2MzLTQwOGItOTUxZi04NGMwM2JmZDAwMmYiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJuaW56YS1jbGllbnQiLCJzZXNzaW9uX3N0YXRlIjoiODk3ODlhZjktNGJmOS00NDQxLWIxZWYtNTM0NjAyNmQ0NjdjIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwOi8vNDkuMjQ5LjI4LjIxODo4MDkxIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJkZWZhdWx0LXJvbGVzLW5pbnphIiwib2ZmbGluZV9hY2Nlc3MiLCJhZG1pbiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJlbWFpbCBwcm9maWxlIiwic2lkIjoiODk3ODlhZjktNGJmOS00NDQxLWIxZWYtNTM0NjAyNmQ0NjdjIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJybWd5YW50cmEifQ.aUhy-H63InUNaFDhmUTyPEon-NMok7exnZ7mxFZq6p46GShqhQi-sar6xaph4Nji8EUu8CerTIzahjM7Pw0E_GWAfHsaLTDLu3nKkiQUQvXC0Jg13IBE-ziedKfGc4QhHK0M47foT3wxK6mAEl_6VRQJavcR7SOthQuDldDiJ6wnM9Q6keDphvSn3o9cPsZU9sdXxsHlcJG_YLH1w1W7QZ6zyntznC95lcu7ux6wyoxZiXKNUE9JJnlGpB8IvSGCw0ak0E3GBJz2nj-UoDiKZmL2NOxFm4zMbAVhRr_CE9a_0Koibmm12umqeM-u80oQ7CXYrFb0AcPG0wdRB6FHoA")
		.log().all()
		
		.when()
		  .get("http://49.249.28.218:8091/projects")
		.then()
		.log().all();
	}
	

}
