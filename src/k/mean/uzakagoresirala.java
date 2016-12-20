/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k.mean;

import java.util.Comparator;

/**
 *
 * @author kripton
 */
import java.util.Comparator;

/**
 *
 * @author Günevi
 */
class uzakligaGoresirala implements Comparator<Uzaklik> {
    
    @Override
    public int compare(Uzaklik o1, Uzaklik o2) {
        return new Double(o1.getuzak()).compareTo(o2.getuzak());
    }
}
