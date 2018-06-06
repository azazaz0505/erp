package nari.mip.card.model;

/**
 * Created by chenlailai on 2017/4/20.
 */
public class Pagination {
    /**
     * 列表条数
     */
    private int totalItems;

    /**
     * 当前正在显示的页数
     */
    private int currentPage;
    
    /**
     * 总页数
     * @return
     */

    private int totalPage;
    
    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    
    public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

}
