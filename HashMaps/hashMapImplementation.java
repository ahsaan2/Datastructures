package HashMaps;

// import java.util.*;

// import javax.swing.text.html.parser.Entity;

public class hashMapImplementation {

  // we will have the implementation of the class hashmap present in the java collections
  // of map interface.
  // class hashMap {

  // internally it would be an array
  private Entity[] entities;

  public hashMapImplementation() {
    entities = new Entity[100];
  }

  // put method
  public void put(String key, String value) {
    // we have to get the hash first, and at that hash we have our key and value.
    int hash = Math.abs(key.hashCode() % entities.length);
    entities[hash] = new Entity(key, value); //
  }

  // get the value of the key
  public String get(String key) {
    // we will first get the hashcode.
    //   check if the hash is not null and the enitity at hte hash key is equal to the key
    int hash = Math.abs(key.hashCode() % entities.length);
    // check if the hash is equal to the key
    if (entities[hash] != null && entities[hash].key.equals(key)) {
      return entities[hash].value;
    }
    return null;
  }

  public void remove(String key) {
    int hash = Math.abs(key.hashCode() % entities.length);
    // condition for matching
    if (entities[hash] != null && entities[hash].key.equals(key)) {
      entities[hash] = null;
    }
  }

  private class Entity {

    // every entity has key and values
    String key;
    String value;

    public Entity(String key, String value) {
      this.key = key;
      this.value = value;
    }
  }

  public static void main(String[] args) {
    hashMapImplementation map = new hashMapImplementation();
    map.put("Apple", "Good fruit");
    map.put("Orange", "Delicious");
    System.out.println(map.get("Apple"));
  }
}
// hashmap class is equivalent to hashtable, except hashmap is not thread-safe(un-Synchronized)and it permits nulls.
