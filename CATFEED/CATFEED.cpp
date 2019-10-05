//Question Link : https://www.codechef.com/problems/CATFEED

#include<iostream>
#include<vector>

using namespace std;

void printCat(vector<int> cat, int n){
    cout<<endl;
    for(int i=1; i<n;++i){
        cout<<" "<<cat[i];
    }
    cout<<"\n";
}

int main(){
    int t,temp;
    int n,m;
    vector<int> cat;
    int flag;
    cin>>t;
    while(t--){
        cin>>n>>m;
        flag=0;
        int M[m+1];
        //cout<<"n : "<<n<<" m : "<<m<<"\n";

        for(int i=0;i<=n;++i){
            cat.push_back(0);
        }

        for(int i=1;i<=m;++i){
            cin>>M[i];
        }

        //printCat(cat,n+1);

        for(int i=1;i<=m;++i){
            temp = M[i];
            switch(cat[temp]){
                case 0:
                    cat[temp] =1;
                    break;
                case 1:
                    cat[temp] = 0;
                    break;
            }
            //cout<<i;
            //printCat(cat,n+1);
            if(!(i%n)){
                switch((i/n)%2){
                    case 0 :
                       for(int i=1;i<=n;++i){
                            if(cat[i]==1){
                                flag = 1;
                                break;
                            }
                        }
                        break;
                    case 1 :
                        for(int i=1;i<=n;++i){
                            if(cat[i]==0){
                                flag = 1;
                                break;
                            }
                        }

                }
            }

            if(flag==1){
                break;
            }



        }

        switch(flag){
                case 0:
                    cout<<"YES\n";
                    break;
                case 1:
                    cout<<"NO\n";
            }



        cat.erase(cat.begin(),cat.end());
    }
}
