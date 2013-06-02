// Generated from src/grammer/NestedNameList.g by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface NestedNameListListener extends ParseTreeListener {
	void enterElement(NestedNameListParser.ElementContext ctx);
	void exitElement(NestedNameListParser.ElementContext ctx);

	void enterList(NestedNameListParser.ListContext ctx);
	void exitList(NestedNameListParser.ListContext ctx);

	void enterElements(NestedNameListParser.ElementsContext ctx);
	void exitElements(NestedNameListParser.ElementsContext ctx);
}