package mul.com.a.dto;

public class Bookparam {
	
	int currentpage;
	int rowsperpage;
	String search;
	String choice;
	String sort;
	String genre;
	
	public Bookparam() {}

	

	public Bookparam(int currentpage, int rowsperpage, String search, String choice, String sort, String genre) {
		super();
		this.currentpage = currentpage;
		this.rowsperpage = rowsperpage;
		this.search = search;
		this.choice = choice;
		this.sort = sort;
		this.genre = genre;
	}



	public int getCurrentpage() {
		return currentpage;
	}

	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}

	public int getRowsperpage() {
		return rowsperpage;
	}

	public void setRowsperpage(int rowsperpage) {
		this.rowsperpage = rowsperpage;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}



	public String getSort() {
		return sort;
	}



	public void setSort(String sort) {
		this.sort = sort;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	@Override
	public String toString() {
		return "Bookparam [currentpage=" + currentpage + ", rowsperpage=" + rowsperpage + ", search=" + search
				+ ", choice=" + choice + ", sort=" + sort + ", genre=" + genre + "]";
	}

	
	
	
	
	
}
