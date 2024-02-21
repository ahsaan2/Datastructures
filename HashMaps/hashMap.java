package HashMaps;

public class hashMap {

  public static void main(String[] args) {
    // get the hashcode of ahsaa
    String name = "ahsaan";
    String name2 = "A"; // 65  , a = 97
    // hashcode is a method in java
    int code2 = name2.hashCode();
    // hashcode for a integer is a hashcode till a certain limit
    Integer a = 4544232;
    int code3 = a.hashCode();
    System.out.println(code3);
    System.out.println(code2);
    // char ch = 'a';
    int code = name.hashCode();
    // int code2 = ch.hashCode();   // can not be used for primitive data types.
    System.out.println(code); // -1418371166
  }
}
/**
 * why hashMaps-->> we can access data in constant amount of time.
 * Structure -->> key (name)             value(marks)
 *                ahsaan                    80
 *                karan                     98
 *                 rahul                    89
 * here we have 3 items, every item has a key and that key has a value
 *  map.get("ahsaan") = value of ahsaan => 80
 * ------------------------------------------HAHSTABLE----------------------------------------------
 * hashTable is like an "array" but when we have to search / insert /delete any data in this, then we don't need
 * to scan it. It used hashFunctions.
 * -----------------------------------------HOW HASHMAP WORKS------------------------------------------------------------
 * HashCode-->> it is a way of getting a number.It returns "Integer" "hashcode representing  the value of the Object."
 * It plays crusial role in data "retreival", when dealing with java collections.
 * -->>(1)we need all the elements as the numbers and for that we use hashCode function.
 * -->>(2)HashCode that we get can be very large, so reduce it.Reduce all elements in table to a size m.
 *------------------------------hashing-----------------------------------------------
                    (storing and retreiving data in O(1))
 means we are trying to reduce the numbers in a "less shorter format", like the hashcode for a very large number
 we try to reduce it using hashing.
 hasing ->> process of "transforming" any given key or string of characters into another value, this is usually
 represented by the shorter-fixed length value.
 ---->> we do modulo 10 to the number, it gets reduced to a smaller digit.
     h(k) = k % 10     (hashfunction = k % array_size)
    A perfect hashfunction always produces unique output for unique input
   A non-perfect hashfunction can make collisions.
 suppose after we do the modulo if we have same number / value for two or more, this is known as collision.
 -----------------------------COLLISION---------------------------------------------------
 The situation where the newly inserted key-maps to an already occupied slot in 
 the hash-table is called collision.
 --->> Techiniques to resolve collision----<<
 1. chaining-->> If the same key occur at the same array of nodes, we convert it into the linkedlist.
 Now we check in linedList if the key is already present, if the key is present then we "update the value" of the key and suppose
 if key was present then we now have two values at the key. and if the key was not present in the linkedList then we
 add a new node.
>>>> worst case , suppose every item we are inserting at the same index value/ key so it will keep on inserting at that
particular linked list.
 */
/**
 * the default capacity of the java hashmap is "16" with a load factor of "0.75".
 * hashMap has "unOrdered keys"(the order of iteration is not guarnteed)
 * ---->> that is hashMaps do not implement iterable interface because it is not clear what it should be iterating,.
 * There are 3 choices 1)key 2) value 3)Entries.
 * load-factor-->> It's a measure that decided when to double array size.
 * default load-factor is 75 % of capacity. suppose the initial capacity is 100 and the moment no.of elements > 75 , it
 * doubles the size.
 * -->> Rehashing -->> it is used to keep the average number of elements less so, that we can traverse in the constant time.
 *
 */
