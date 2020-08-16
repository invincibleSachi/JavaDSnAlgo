package com.Array;

import java.util.Arrays;

public class MaximumProfitShares {
    static int[] price={10,22,5,75,65,80};
    static int k=2;
    static int[] buyAtArr=new int[k];
    static int[] sellAtArr=new int[k];
    static int[] maxProfit=new int[k];

    public static void main(String[] args){
        int max_diff1=0,max_diff2=0,i=0,p=0,diff=0;
        int fstBuyAt=0,fstSellAt=0,sBuyAt=0,sSellAt=0;
        int g=getMaxProfit(price.length,0);
        int g1=getMaxProfit(g,1);
        System.out.println(Arrays.toString(buyAtArr));
        System.out.println(Arrays.toString(sellAtArr));
        System.out.println(Arrays.toString(maxProfit));
    }

    public static int getMaxProfit(int endTill,int index){
        int i=0;
        int p=i;
        int diff=0;
        int buyAt=0;
        int sellAt=0;
        int max_diff1=0;
        while(i< endTill){
            p++;
            if(p== endTill){
                i++;
                if(i>= endTill-2){
                    break;
                }
                p=i+1;
            }
            diff=price[p]-price[i];
            if(diff>max_diff1){
                max_diff1=diff;
                buyAt=i;
                sellAt=p;
            }
        }
        buyAtArr[index]=buyAt;
        sellAtArr[index]=sellAt;
        maxProfit[index]=max_diff1;
        return buyAt;
    }
}
