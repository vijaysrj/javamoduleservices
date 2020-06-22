
package seller;

import java.util.Iterator;
import java.util.ServiceLoader;

import seller.CoconutAgent;

public class SellCoconuts{


    public static String sellCoconuts(){


 ServiceLoader<CoconutAgent> sl
                = ServiceLoader.load(CoconutAgent.class);
            Iterator<CoconutAgent> iter = sl.iterator();
            if (!iter.hasNext())
                throw new RuntimeException("No service providers found!");
CoconutAgent provider = iter.next();
        return provider.sellCoconuts();

	}

}