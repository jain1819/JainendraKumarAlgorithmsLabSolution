package com.greatlearning.service;

public class MergeSort {
	
		void merge(int arr[], int left, int mid, int right) {
			// Finding sizes of two sub arrays to be merged
			int l = mid - left + 1;
			int r = right - mid;

			/* Creating temporary arrays */
			int leftArray[] = new int[l];
			int rightArray[] = new int[r];

			/* Copy data to temporary arrays */
			for (int i = 0; i < l; ++i)
				leftArray[i] = arr[left + i];
			for (int j = 0; j < r; ++j)
				rightArray[j] = arr[mid + 1 + j];

			/* Merge the temporary arrays */

			// Initial indexes of first and second sub-arrays
			int i = 0, j = 0;

			// Initial index of merged sub-array array
			int k = left;
			while (i < l && j < r) {
				if (leftArray[i] >= rightArray[j]) {
					arr[k] = leftArray[i];
					i++;
				} else {
					arr[k] = rightArray[j];
					j++;
				}
				k++;
			}

			/* Copy remaining elements of L[] if any */
			while (i < l) {
				arr[k] = leftArray[i];
				i++;
				k++;
			}

			/* Copy remaining elements of R[] if any */
			while (j < r) {
				arr[k] = rightArray[j];
				j++;
				k++;
			}
		}

		// Main function that sorts array[left...right] using merge()
		public void sort(int[] notes, int left, int right) {
			if (left < right) {
				// Find the middle point
				int mid = (left + right) / 2;

				// Sort first and second halves
				sort(notes, left, mid);
				sort(notes, mid + 1, right);

				// Merge the sorted halves
				merge(notes, left, mid, right);
			}
		}
	}


