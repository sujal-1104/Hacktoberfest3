class Node:
    def __init__(self,data):
        self.data=data
        self.next=None
class LinkedList:
    head=None
    def __init__(self):
        self.head=None
    def print(self):
        temp = self.head
        while temp:
            print(str(temp.data)+"-->",end="")
            temp=temp.next
        print("null")
    def length(self):
        if(head == "")
            return 0
        count = 0
        current = head
        while current != "":
            count +=1
            current =current.next
        return count











if __name__=='__main__':
    list=LinkedList()
    list.head=Node(1)
    second=Node(2)
    list.head.next=second
    list.print()



