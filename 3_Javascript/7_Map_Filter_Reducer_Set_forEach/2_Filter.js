const arr=[22,40,98,3,54,20,10];
const new_arr=arr.filter((num)=>num>50);
console.log(new_arr);

Array.prototype.filtering = function(compare){
    const ans = [];
    for(let num of this){
        if(compare(num)){
            ans.push(num);
        }
    }
    return ans;
}

const newArr = arr.filtering((num) => num>=40);
console.log(newArr);