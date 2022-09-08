package cleanCode.chapter3;

public class HtmlUtil {
	
	private void includeSetupPages(WikiPage testPage, StringBuffer newPageContent, boolean isSuite){
		if (isSuite) {
			String pagePathName = PathParser.render(testPage);
			newPageContent.append("!include -setup .")
			.append(pagePathName)
			.append("\n");
		}
	}

	private void includeTeardownPages(WikiPage testPage, StringBuffer newPageContent, boolean isSuite){
		if (isSuite) {
			String pagePathName = PathParser.render(testPage);
			newPageContent.append("!include -setup .")
			.append(pagePathName)
			.append("\n");
		}
	}

	public static String renderPageWithSetupsAndTeardowns(PageData pageData, boolean isSuite) throws Exception {
		boolean isTestPage = pageData.hasAttribute("Test");
		if (isTestPage) {
			WikiPage testPage = pageData.getWikiPage();
			StringBuffer newPageContent = new StringBuffer();
			includeSetupPages(testPage, newPageContent, isSuite);
			newPageContent.append(pageData.getContent());
			includeTeardownPages(testPage, newPageContent, isSuite);
			pageData.setContent(newPageContent.toString());
		}
		return pageData.getHtml();
	}


	private boolean isTestPage(PageData pageData){
		return pageData.hasAttribute("Test");
	}

	private void includeSetupAndTeardownPages(PageData pageData, boolean isSuite){
		if (isSuite) {
			StringBuffer newPageContent = new StringBuffer();
			String pagePathName = PathParser.render(pageData);
			newPageContent.append("!include -setup .")
			.append(pagePathName)
			.append("\n");
		}
	}

	private static String renderPageWithSetupsAndTeardowns(PageData pageData, boolean isSuite) throws Exception {
		if (isTestPage(pageData))
			includeSetupAndTeardownPages(pageData, isSuite);
		return pageData.getHtml();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
