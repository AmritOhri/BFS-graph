  void BFS(int s){
        bool Visited[V];
        for (int i=0;i<V;i++) Visited[i]=false;
        queue<int> q;
        q.push(s);q.push(-1);
        Visited[s]=true;
        while (!q.empty()){
            int f=q.front();
            q.pop();
            if (f==-1) {
                cout<<endl;
                if (!q.empty()) q.push(-1);
            } else {
                cout<<f<<" ";
                for (auto it=ll[f].begin();it!=ll[f].end();it++){
                    if (!Visited[*it]){
                        q.push(*it);
                        Visited[*it]=true;
                    }
                }
            }

        }
    }
