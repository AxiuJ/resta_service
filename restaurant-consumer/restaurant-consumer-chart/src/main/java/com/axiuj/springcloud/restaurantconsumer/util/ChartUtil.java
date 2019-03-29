package com.axiuj.springcloud.restaurantconsumer.util;

import com.axiuj.springcloud.ChartData.Chartdata;
import com.axiuj.springcloud.restaurantconsumer.entity.chartvo;
import lombok.Data;

import java.util.*;

/**
 * @创建人 axiuj
 * @创建时间 2019/3/25
 * @描述
 */
@Data
public class ChartUtil {
    public List<chartvo> getchartvo(List<Chartdata> chartdatas) {
        List<chartvo> cs = new ArrayList<>();

        Set<String> s = new HashSet<>();

        Iterator<Chartdata> iterator = chartdatas.iterator();

        while (iterator.hasNext()) {
            s.add(iterator.next().getStaffname());
        }
        for (String staffname : s) {
            chartvo chartvo = new chartvo();
            chartvo.setName(staffname);
            iterator = chartdatas.iterator();
            double[] item = new double[31];

            while (iterator.hasNext()) {
                Chartdata dat = iterator.next();

                if (staffname.equals(dat.getStaffname()) == true) {
                    item[dat.getDataname()] = dat.getTotal();
                }
            }
            chartvo.setTotals(item);
            cs.add(chartvo);
        }
        return cs;
    }
}
