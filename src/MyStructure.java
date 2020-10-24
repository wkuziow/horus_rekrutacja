import java.util.LinkedList;
import java.util.List;

public class MyStructure implements IMyStructure, ICompositeNode {
  private List<INode> nodes;
  private String code;
  private String renderer;

  @Override
  public INode findByCode(String code) {
    for (INode node : nodes) {
      if (node.getCode().equals(code)) {
        return node;
      }
    }
    return null;
  }

  @Override
  public INode findByRenderer(String renderer) {
    for (INode node : nodes) {
      if (node.getRenderer().equals(renderer)) {
        return node;
      }
    }
    return null;
  }

  @Override
  public int count() {
    return nodes.size();
  }

  @Override
  public List<INode> getNodes() {
    return nodes;
  }


  @Override
  public String getCode() {
    return code;
  }

  @Override
  public String getRenderer() {
    return renderer;
  }
}