/* Copyright 2017 Paul Bouman
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the  
 * "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR
 * ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH
 * THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * In case you use this software for research purposes, it is appreciated if you provide a citation of the following paper:
 * 
 * N.A.H. Agatz, P.C. Bouman & M.E. Schmidt. Optimization Approaches for the Traveling Salesman Problem with Drone. Transportation Science.
 * 
 * The paper still has to appear, but was accepted for publication. This notice will be updated with a more detailed reference if that
 * information is available.
 */

package nl.rsm.tom.drones.data;

/**
 * This is a sub-interface of distance that indicates that this distance
 * ignores any action information. It thus relates to instances where
 * there are no flight limits for the drone and all actions except
 * moving from one location to another take no time.
 *
 * @author Paul Bouman
 *
 * @param <E> the type of location this distance measure applies to
 */

@FunctionalInterface
public interface SimpleDistance<E> extends Distance<E>
{
	@Override
	public default double getDistance(E from, E to, Action fromAction, Action toAction, double prior)
	{
		return getSimpleDistance(from, to);
	}
	
	/**
	 * A simple distance method that determines the costs of movement only
	 * based on two locations and no other information. 
	 * @param from the departure location
	 * @param to the destination location
	 * @return the distance of travel
	 */
	public double getSimpleDistance(E from, E to);
}
