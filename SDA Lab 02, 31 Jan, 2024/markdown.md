## Muhammad Rehan | 22p-9106  | Lab Task 02 |
[![LabTask.png](https://i.postimg.cc/L6qv7Jck/LabTask.png)](https://postimg.cc/YhH1LCqj)

## Assumptions:

- The `Accept and Reject use case` is parent, and `Print Recipt` is child. It could be inclusive, but parent/child makes more sense here, as `print receipt` comes after the `accept/reject code`.  

- `Manage products` is the base case, and `delete`,` add`, and `update` are extended but not included, because including them means all of them will be executed but only one of them will be executed at a time.  

- `Login`, `search`, and `add to favorites` are simple relational use cases.  

- `Place order` is parent and `make payment` is included as it will executed always, and `cash` and `credit card` is extended because only of them will be executed.  
>**_I added a use case `checkout` as it should be part of the use case `diagram` as it's an indivilual process in itself. and as mentioned in the lab task, the `view order` is optional, so it is extended._**






