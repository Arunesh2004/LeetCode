class Solution {
public:
    int calPoints(vector<string>& operations) {
        
        vector<int> score;

        for(auto& it : operations){

            if(it == "D"){

                score.push_back(score.back()*2);

            }
            else if(it == "C"){

                score.pop_back();

            }
            else if(it == "+"){

                int size = score.size();

                score.push_back(score[size - 1] + score[size - 2]);

            }
            else{

                score.push_back(stoi(it));

            }
        }

        int sum = 0;
        for(auto& it : score){

            sum = sum + it;

        }

        return sum;
    }
};