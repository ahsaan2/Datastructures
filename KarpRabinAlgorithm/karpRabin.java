package KarpRabinAlgorithm;

public class karpRabin {

}
  
  /*
   * suppose we have two strings
   * String a = "Ahsaan"
   * String b = "AhsaanApoorHello"
   * -->> find whether String a exists in String b
   * Yes, sting a exits--
   * 1. w can search for this string length(Ahsaan is length of 5), check for this length in the string b
   * and if the match is not found we move by the length(like like sliding window)
   * -->> This will have the quadratic time complexity
   * -------------------------------------------------------------------------------------
   * ==>>how can we do it in the linear time complexity
   * string searching in linear time is done by the karp_rabin algorithm
   *          h(a) = h(b)[i : i + length(a)]
   * -->> It compares the "hashvalue" of string a in string b.
   * (1).If hash of a = hash of b, it might be possible the match has found, if match is found, check for the
   *  every character.If all the characters are equal we have found the answer
   * -->> So, h(a) == h(subString), but a != subString. (two strings we have found with the same hashCode but the strings are different)
   * the probabiltiy of this happening is , probability = 1 / len(a).
   *
   * ---->> Two different strings can indeed have the same hash value, though this happens rarely.
   * ---------------------------------------------------------------------------------
   * las-vegas Algorithm -->> character by character verification of all the potential matches.It always produces the correct
   * result or it informs about the failure.
   *
   *
   *
   *
   *
   *
   */

