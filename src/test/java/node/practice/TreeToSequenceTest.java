package node.practice;

import node.Node;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :node.practice
 * @Description :${todo}
 * @date : 2017/3/6 14:26
 */
public class TreeToSequenceTest {
    @Test
    public void convert() throws Exception {
        Node node = new Node(132);
        node.left = new Node(11);
        node.right = new Node(375);
        new TreeToSequence().convert(node);
    }

}