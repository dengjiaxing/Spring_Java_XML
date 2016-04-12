import java.util.List;

import javax.lang.model.element.Element;
import javax.swing.text.Document;

import org.jdom.input.SAXBuilder;

public class JdomSample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SAXBuilder sb = new SAXBuilder();
		org.jdom.Document doc = sb.build(JdomSample.class.getClassLoader().getResourceAsStream("test.xml"));
		org.jdom.Element root = ((org.jdom.Document) doc).getRootElement();//获取根元素
		List list = root.getChildren("disk");//获取根元素所有名字为disk的子元素
		for (int i = 0; i < list.size(); i++) {
			org.jdom.Element element = (org.jdom.Element) list.get(i);
			String name = element.getAttributeValue("name");
			String capacity = element.getChildText("capacity");
			String directories = element.getChildText("directories");
			String files = element.getChildText("files");
			System.out.println("磁盘信息");
			System.out.println("分区盘符：" + name);
			System.out.println("分区容量：" + capacity);
			System.out.println("目录数：" + directories);
			System.out.println("文件数：" + files);
			System.out.println("------------------------");
		}
	}
}
