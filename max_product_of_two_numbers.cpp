#include <algorithm>
using namespace std;

int main() {

	int t;
	cin >> t;
	while(t--)
	{
		int n,max;
		cin >> n;
		int a[n];

		for(int i=0; i<n; i++)
			cin >> a[i];

		sort(a,a+n);
		max = a[n-2]*a[n-1];
		cout << max << endl;
	}

	return 0;
}
