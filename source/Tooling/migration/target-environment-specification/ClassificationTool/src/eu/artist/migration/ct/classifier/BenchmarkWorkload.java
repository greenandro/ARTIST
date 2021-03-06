/*
 * Copyright 2015 ICCS/NTUA 
 * Licensed under the Eclipse Public License(EPL) version 1.0 License;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * https://www.eclipse.org/legal/epl-v10.html
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors: Athanasia Evangelinou
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *
 */

package eu.artist.migration.ct.classifier;

public class BenchmarkWorkload extends Workload implements Comparable<BenchmarkWorkload> {
	private String name;
	private double distanceFromRequest;
	
	public BenchmarkWorkload(String name) {
		super();
		this.name = name;
		distanceFromRequest = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getDistanceFromRequest() {
		return distanceFromRequest;
	}

	public void setDistanceFromRequest(double distanceFromRequest) {
		this.distanceFromRequest = distanceFromRequest;
	}
	
	@Override
	public String toString() {
		return "Workload: " + name + "\tVector size: " + vector.length ;
	}
	
	@Override
	public int compareTo(BenchmarkWorkload other) {
		if (this.getDistanceFromRequest() < other.getDistanceFromRequest()) {
			return -1;
		}
		else if (this.getDistanceFromRequest() == other.getDistanceFromRequest()) {
			return 0;
		}
		return 1;
	}
}
