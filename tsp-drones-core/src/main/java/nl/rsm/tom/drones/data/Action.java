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
 * Enum that can be used to identify the kind of action a vechile (e.g. drone or truck) performs
 * @author Paul Bouman
 *
 */
public enum Action
{
	/**
	 * Models the departure of a vehicle from a location where two vehicle were together
	 */
	DEPARTURE,
	/**
	 * Models the fact that a vehicle visits a location, e.g. to deliver a package
	 */
	VISIT,
	/**
	 * Models the arrival of a vehicle at a location where it joins another vehicle
	 */
	ARRIVAL,
	/**
	 * Models unknown actions, if a certain algorithm is not able to distuingish
	 * different types of actions
	 */
	UNDEFINED;
}
