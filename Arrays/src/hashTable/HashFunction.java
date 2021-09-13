package hashTable;
import java.util.ArrayList;
import java.util.Objects;
public class HashFunction {
	public static void main(String args[]) {
		Map<String, Integer> hash = new Map<String, Integer>(10);
		hash.set("Jayant", 30);
		hash.set("Akash", 18);
		hash.set("Ritesh", 06);
		hash.set("Nilanjan", 27);
		hash.set("Sayantan", 33);
		System.out.println(hash.get("Jayant"));
	}
	
	
}
class Map<K,V> {
	ArrayList<HashNode<K,V>> array;
	private int size;
	
	public Map(int size) {
		this.array = new ArrayList<HashNode<K,V>>();
		this.size = size;
		for(int i = 0;i<size;i++)
			this.array.add(null);
	}
	
	private int hashCode(K key) {
		return Objects.hashCode(key);
	}
	
	void set(K key, V value) {
		int hashCode = hashCode(key);
		int index = hashCode % this.size;
		index = index<0?(-index):index;
		HashNode<K, V> head = this.array.get(index);
		
		if(head==null) {
			HashNode<K, V> newNode = new HashNode<>(key,value);
			this.array.set(index, newNode);
			return;
		}
		
		while(head.next!=null) {
			if(head.next.key.equals(key)) {
				head.next.value = value;
				return;
			}
			head = head.next;
		}
		
		HashNode<K, V> newNode = new HashNode<>(key,value);
		head.next = newNode;
	}
	
	V get(K key) {
		int hashCode = hashCode(key);
		int index = hashCode % this.size;
		index = index<0?(-index):index;
		HashNode<K, V> head = this.array.get(index);
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
}

class HashNode<K,V> {
	K key;
	V value;
	HashNode<K, V> next;
	public HashNode(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
}






















