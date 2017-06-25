/*
The MIT License (MIT)

Copyright (c) 2014 atsb

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package com.lotteryguess;

import java.util.HashMap;
import java.util.Map;

public class Main {
    //Main method
    public static void main(String[] args) {
        //Setting up our Map
        Map<String, String> lottoText =
                new HashMap<String, String>();
        //What text to print to console
        lottoText.put("Number to choose"," ");
        //Number sequence generated must be 8 in total
        for (int lottoRandomizer = 0; lottoRandomizer <8; ++lottoRandomizer) {
            //Numbers cannot exceed 99
            int lottoRandomGenerator = (int)(99 * Math.random());
            //Reiterating over our Map and printing the text -
            //and numbers with a semicolon until all numbers are printed
        for (String key: lottoText.keySet()) {
            System.out.println(key + ": " + lottoRandomGenerator + lottoText.get(key));
            }
        }
    } //Main method end
} //Class end
