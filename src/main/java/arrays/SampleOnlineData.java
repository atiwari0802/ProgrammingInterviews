package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class SampleOnlineData {

    public List<Integer> sampleOnlineData(Iterator<Integer> stream, int k) {
        List<Integer> sampledData = new ArrayList<>(k);

        for (int i = 0; i < k && stream.hasNext(); i++) {
            sampledData.add(stream.next());
        }

        int dataProcessedSoFar = k;
        Random random = new Random();

        while (stream.hasNext()) {
            dataProcessedSoFar++;
            int data = stream.next();
            int newIndex = random.nextInt(dataParsedSoFar);

            if (newIndex < k) {
                sampledData.set(newIndex, data);
            }
        }
        return sampledData;
    }

}
